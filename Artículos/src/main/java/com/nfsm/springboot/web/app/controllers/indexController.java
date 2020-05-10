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
		
		producto.add(new Productos("Zucaritas", 
						"Hojuelas de maíz con azúcar adicionadas con complejo B, hierro y zinc.",
						"$46.90", 
						"Kellogg’s ", 
						"460 g.", 
						"Kellogg’s"));
		
		producto.add(new Productos("Pan blanco",
				"Actileche es una fórmula desarrollada por Bimbo y el Instituto Nacional de Nutrición Salvador Zubirán. Contiene leche, que aporta calcio, vitaminas (D, A, B1, B2), niacina, ácido fólico y minerales (hierro, calcio, zinc, yodo y fósforo), importantes para el desarrollo y crecimiento infantil.",
				"$29.50", 
				"Bimbo", 
				"640 g.", 
				"Bimbo"));
		
		producto.add(new Productos("Cheetos Poff",
				"Botana Cheetos® Poffs® es una deliciosa opción hecha de cereal de maíz con el sabor a queso que tanto te gusta. Conoce su sabor y consiente a tu paladar desde el primer bocado.",
				"$25.00", 
				"Sabritas", 
				"100 g.", 
				"Sabritas"));
		
		producto.add(new Productos("Leche clásica",
				"La leche Alpura Clásica es fundamental en tu despensa ya que contiene proteína propia de la leche que te da la energía para comenzar tu día y que ayuda al desarrollo de músculos. Además de ser una fuente de calcio que ayuda a el crecimiento de dientes definitivos en los niños y da fortaleza ósea en adolescentes y adultos.",
				"$20.50", 
				"Alpura", 
				"1 L.", 
				"Alpura"));
		
		producto.add(new Productos("Galleta oreo",
				"Disfruta el crujiente sabor de las galletas dulces Oreo, galleta tipo sándwich sabor a chocolate con un rico y cremoso relleno sabor a vainilla. Disfruta de este bocadillo a cualquier hora del día, como sugerencia puedes acompañar con un vaso de leche fría o incluso con tu bebida caliente preferida.",
				"$14.00", 
				"Oreo",
				"114 g.", 
				"Oreo"));
		
		return "listar";
	}
	
}
