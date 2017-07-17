package es.cic.taller.tresEnRaya;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.Resource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


import es.cic.taller.tresEnRaya.MyUI;
import es.cic.taller.tresEnRaya.clases.Jugador;

public class Principal extends VerticalLayout {

	private VerticalLayout layoutv = new VerticalLayout();
	private HorizontalLayout layouth = new HorizontalLayout();
	private GridLayout grid = new GridLayout(3, 3);
	private TextField name = new TextField();
	private TextField texto1 = new TextField("texto1");
	
	
	private Jugador jugador0= new Jugador();
	private Jugador jugador1= new Jugador();
	private Jugador jugador2= new Jugador();
	
	
	private MyUI myUI;

	public Principal(MyUI myUI) {
		this.myUI = myUI;

		grid.setRows(4);
		grid.setColumns(4);
		
		jugador0.setNombre("jugador0");	
		jugador0.setImagen(cargaImagen(jugador0));
		
		jugador1.setNombre("jugador1");	
		jugador1.setImagen(cargaImagen(jugador1));
		
		jugador2.setNombre("jugador2");	
		jugador2.setImagen(cargaImagen(jugador2));
		
		
		grid.addComponent(cargaImagen(jugador0),1,1);
		grid.addComponent(cargaImagen(jugador1),1,2);
		grid.addComponent(cargaImagen(jugador2),1,3);
		grid.addComponent(cargaImagen(jugador1),2,1);
		grid.addComponent(cargaImagen(jugador2),2,2);
		grid.addComponent(cargaImagen(jugador1),2,3);
		grid.addComponent(cargaImagen(jugador0),3,1);
		grid.addComponent(cargaImagen(jugador2),3,2);
		grid.addComponent(cargaImagen(jugador0),3,3);
		
		

//		layouth.addComponents(name, button);

		addComponents(layouth, grid);

	}
//	public String getNombreFichero() {
//	String texto = "jugador"+ this.numero + ".png";
//	return texto;
//}


private Resource getImageResource(String recurso) {
	String basepath = VaadinService.getCurrent()
            .getBaseDirectory().getAbsolutePath();
	FileResource resource = new FileResource(new File(basepath +
            "/images/" + recurso));
    return resource;
}

private Image cargaImagen(Jugador jugador) {
	Image imagen=new Image();
	imagen.setSource(getImageResource(jugador.getNombreFichero()));
	imagen.setWidth("100px");
	imagen.setHeight("200px");
	return imagen;
}

}
