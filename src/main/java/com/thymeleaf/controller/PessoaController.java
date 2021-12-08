package com.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.thymeleaf.model.Pessoa;
import com.thymeleaf.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "cadastropessoa")
	public String inicio() {
		return "cadastro/cadastropessoa";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "salvarpessoa")
	public String salvar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return "cadastro/cadastropessoa";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "listapessoas")
	public ModelAndView pessoas() {
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastropessoa");
		
		 /*Ao iterar o objeto pessoas iterable da classe pessoa
		  * Recebe a interface do pessoarepository (que herdou da mãe CrudRepository) o metodo de procurar todos
		  */
		Iterable<Pessoa> pessoasIterable = pessoaRepository.findAll();
		modelAndView.addObject("pessoas", pessoasIterable);
		
		return modelAndView;
	}
	
}
