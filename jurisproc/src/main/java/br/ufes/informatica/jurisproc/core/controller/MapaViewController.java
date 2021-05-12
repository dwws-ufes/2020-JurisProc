package br.ufes.informatica.jurisproc.core.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@Named
@RequestScoped
public class MapaViewController
{

	private MapModel simpleModel;

	@PostConstruct
	public void init()
	{
		simpleModel = new DefaultMapModel();

		LatLng coord1 = new LatLng(36.879466, 30.667648);
		LatLng coord2 = new LatLng(36.883707, 30.689216);
		LatLng coord3 = new LatLng(36.879703, 30.706707);
		LatLng coord4 = new LatLng(36.885233, 30.702323);

		simpleModel.addOverlay(new Marker(coord1, "Konyaalti"));
		simpleModel.addOverlay(new Marker(coord2, "Ataturk Parki"));
		simpleModel.addOverlay(new Marker(coord3, "Karaalioglu Parki"));
		simpleModel.addOverlay(new Marker(coord4, "Kaleici"));

	}

	public MapModel getSimpleModel()
	{
		return simpleModel;
	}
	
	

}
