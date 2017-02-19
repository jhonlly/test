package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, img2;
	private  int alto, ancho, altoImagen, anchoImagen;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("mario.png");
		img2 = new Texture("barcelona.jpg");
		//Medidas de la pantalla.
		ancho = Gdx.graphics.getWidth();
		alto= Gdx.graphics.getHeight();
		System.out.println("Alto: "+ alto +" ancho: "+ancho);
		//medidas de img
		anchoImagen = img.getWidth();
		altoImagen =img.getHeight();
		System.out.println("Alto imagenen: "+ altoImagen +" ancho imagenen: "+anchoImagen);
	}

	@Override
	public void render () {
		//Con esta llamada podemos limpiar los bits de la pantalla y
		// ademas ponerle un color de fondo.
	    Gdx.gl.glClearColor(0.5f, 1,0.2f, 1);
		//Llamaremos al método "glClear" de la clase Gdx. para limpiar la imagenes que hayan
		//en pantalla
 		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img,ancho -anchoImagen, alto-altoImagen);
		batch.draw(img,0, 0);
		batch.draw(img,0, alto-altoImagen);
		batch.draw(img,ancho -anchoImagen, 0);
		batch.end();
	}
	
	@Override
	//todos los elementos que dibujemos demos liberarlo dentro de este método. siempre
	//dispongan del metodo dispose().
	public void dispose () {
		batch.dispose();
		img.dispose();
		img2.dispose();
	}
}
