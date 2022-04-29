package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiPrimerControlador {
	
	@RequestMapping(path = "/hola", method = RequestMethod.GET)
	public ModelAndView miprimervista() {

		
		
		return new ModelAndView("miprimervista");
	}
	
	
	@RequestMapping(path = "/vista2", method = RequestMethod.GET)
	public ModelAndView misegundavista() {

		ModelMap modelo = new ModelMap();
		modelo.put("mensaje1", "hoy es jueves ");
		modelo.put("mensaje2", "21");
		
		return new ModelAndView("miprimervista",modelo);
	}
	
	@RequestMapping (path="/vista3" , method=RequestMethod.GET)
	public ModelAndView hola2 (@RequestParam (value ="op1")Integer parametro1 , @RequestParam(value= "op2")Integer parametro2){
		
		ModelMap modelo =new ModelMap();
		
		Integer resultado =parametro1+parametro2;
		
		modelo.put("resultado",resultado);
		
		return new ModelAndView("miprimervista",modelo);
		
	}
	

}
