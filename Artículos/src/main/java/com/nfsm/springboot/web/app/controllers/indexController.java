package com.nfsm.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nfsm.springboot.web.app.models.Productos;


@Controller
@RequestMapping("/app")

public class indexController {
	
	@RequestMapping ("/listar")
	public String listar(Model model) {
		List<Productos> producto=new ArrayList<>();
		model.addAttribute("titulo", "Lista de productos"); 
		model.addAttribute("productos", producto);
		
		Productos productos=new Productos();
		
		producto.add(new Productos("Zucaritas", "Hojuelas de maíz con azúcar adicionadas con complejo B, hierro y zinc.", "$46.90", "Kellogg’s ", "460 g.", "Kellogg’s"));
		producto.add(new Productos("Pan blanco", "Actileche es una fórmula desarrollada por Bimbo y el Instituto Nacional de Nutrición Salvador Zubirán. Contiene leche, que aporta calcio, vitaminas (D, A, B1, B2), niacina, ácido fólico y minerales (hierro, calcio, zinc, yodo y fósforo), importantes para el desarrollo y crecimiento infantil.", "$29.50", "Bimbo", "640 g.", "Bimbo"));
		
		return "listar";
	}
	
}
