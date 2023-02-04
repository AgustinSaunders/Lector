package com.agustines.lector;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class LectorDeFacturasApplication {

	public static void main(String[] args) {
		SpringApplication.run(LectorDeFacturasApplication.class, args);

		try{
			String ubicacion = "E:/Proyects/Lector de faturas/lector-de-facturas/facturas/factura1.pdf";
			PdfReader factura = new PdfReader(ubicacion);

			int paginas= factura.getNumberOfPages();
			for (int i=1; i<=paginas; i++){
				String content= PdfTextExtractor.getTextFromPage(factura, i);
				System.out.println(content);
			}


		} catch (IOException e) {
			throw new RuntimeException(e);
		} ;
	}

}
