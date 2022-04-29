package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPlan {
	
	@RequestMapping(path="/plan", method=RequestMethod.GET)
	public ModelAndView mostrarPlan() {
		
		
		return new ModelAndView("vistaPlanes");
	}
	
	@RequestMapping(path="/vistaPlan1", method=RequestMethod.GET)
	public ModelAndView mostrarPlan2() {
		
		
		return new ModelAndView("vistaPlanes");
	}
	
	@RequestMapping(path="/vistaPlan2", method=RequestMethod.GET)
	public ModelAndView mostrarPlan3() {
		
		
		return new ModelAndView("home");
	}
	
	@RequestMapping(path="/vistaPlan3", method=RequestMethod.GET)
	public ModelAndView mostrarPlan4() {
		
		
		return new ModelAndView("home");
	}
	

}
