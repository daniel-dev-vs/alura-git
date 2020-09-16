package br.com.alura.forum.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicosControllerTest {
	
	@Autowired
	private TopicosController topicosController;
	
	@MockBean
	private TopicoRepository topicoRepository;

	@Test
	public void lista() {
		ArrayList<Topico> expected = new ArrayList<Topico>();
		when(topicoRepository.findAll()).thenReturn(expected);
		
		Curso curso1 = new Curso();
		
		curso1.setCategoria("Programacao");
		curso1.setId((long) 1);
		curso1.setNome("JAveiro.com");
				
		Topico topico1 = new Topico("Titulo","Mensagem", curso1);
		Topico topico2 = new Topico("Titulo","Mensagem", curso1);
		
		expected.add(topico1);
		expected.add(topico2);
		
	
		
		
		
		List<TopicoDto> actual  = topicosController.lista(null, 1, 10);
		
		
		
		Assert.assertEquals(expected.get(0).getTitulo(), actual.get(0).getTitulo());
		
	}
}
