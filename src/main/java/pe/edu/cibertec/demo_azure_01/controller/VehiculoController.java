package pe.edu.cibertec.demo_azure_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.demo_azure_01.viewmodel.VehiculoModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {

    @GetMapping("/")
    public String obtenerVehiculos(Model model) {
        List<VehiculoModel> listaVehiculos = new ArrayList<VehiculoModel>();
        listaVehiculos.add(new VehiculoModel(1, "Honda", "Civic", "Azul", "XYZ789"));
        listaVehiculos.add(new VehiculoModel(2, "Ford", "Mustang", "Negro", "LMN456"));
        listaVehiculos.add(new VehiculoModel(3, "Chevrolet", "Spark", "Blanco", "QWE321"));
        listaVehiculos.add(new VehiculoModel(4, "Nissan", "Sentra", "Gris", "RTY654"));
        listaVehiculos.add(new VehiculoModel(5, "Hyundai", "Elantra", "Verde", "ASD987"));

        model.addAttribute("listaVehiculos", listaVehiculos);
        return "vehiculos";
    }
}
