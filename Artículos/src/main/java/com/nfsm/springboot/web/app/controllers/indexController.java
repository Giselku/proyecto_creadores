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
		List<Productos> productos=new ArrayList<Productos>();
		model.addAttribute("titulo", "Lista de productos"); 
		model.addAttribute("productos", productos);
		
		
		
		productos.add(new Productos("Zucaritas", 
						"Hojuelas de maiz con azucar adicionadas con complejo B, hierro y zinc.",
						"$46.90", 
						"Kellogg's ", 
						"460 g.", 
						"Kellogg's"));
		
		productos.add(new Productos("Pan blanco",
				"Actileche es una formula desarrollada por Bimbo y el Instituto Nacional de Nutriciòn Salvador Zubiràn. Contiene leche, que aporta calcio, vitaminas (D, A, B1, B2), niacina, àcido fòlico y minerales (hierro, calcio, zinc, yodo y fòsforo), importantes para el desarrollo y crecimiento infantil.",
				"$29.50", 
				"Bimbo", 
				"640 g.", 
				"Bimbo"));
		
		productos.add(new Productos("Cheetos Poff",
				"Botana Cheetos Poffs es una deliciosa opciòn hecha de cereal de maìz con el sabor a queso que tanto te gusta. Conoce su sabor y consiente a tu paladar desde el primer bocado.",
				"$25.00", 
				"Sabritas", 
				"100 g.", 
				"Sabritas"));
		
		productos.add(new Productos("Leche clàsica",
				"La leche Alpura Clàsica es fundamental en tu despensa ya que contiene proteìna propia de la leche que te da la energìa para comenzar tu dìa y que ayuda al desarrollo de mùsculos. Ademàs de ser una fuente de calcio que ayuda a el crecimiento de dientes definitivos en los niños y da fortaleza òsea en adolescentes y adultos.",
				"$20.50", 
				"Alpura", 
				"1 L.", 
				"Alpura"));
		
		productos.add(new Productos("Galleta oreo",
				"Disfruta el crujiente sabor de las galletas dulces Oreo, galleta tipo sàndwich sabor a chocolate con un rico y cremoso relleno sabor a vainilla. Disfruta de este bocadillo a cualquier hora del dìa, como sugerencia puedes acompañar con un vaso de leche frìa o incluso con tu bebida caliente preferida.",
				"$14.00", 
				"Oreo",
				"114 g.", 
				"Oreo"));
		
		return "listar";
	}
	
}
