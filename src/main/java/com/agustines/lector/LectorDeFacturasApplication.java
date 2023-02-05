package com.agustines.lector;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.IOException;
@SpringBootApplication
public class LectorDeFacturasApplication {

	public static void main(String[] args) {
		SpringApplication.run(LectorDeFacturasApplication.class, args);
		File muestra = new File("E:/Proyects/Lector de faturas/lector-de-facturas/facturas/prueba3.png");
		ITesseract imagen = new Tesseract();
		try {
			String resultado = imagen.doOCR(muestra);
			String cae = "CAE N";
			int indice = resultado.indexOf(cae);
			String listo = resultado.substring(indice, indice + 21);
			System.out.println(listo);

		}catch (TesseractException e){
			System.out.println("Exception " + e.getMessage());
		}
	}
}
