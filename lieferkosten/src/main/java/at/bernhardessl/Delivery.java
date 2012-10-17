package at.bernhardessl;

/**
 * Returns an Image object that can then be painted on the screen. 
 * The url argument must specify an absolute {@link URL}. The name
 * argument is a specifier that is relative to the url argument. 
 * <p>
 * This method always returns immediately, whether or not the 
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives 
 * that draw the image will incrementally paint on the screen. 
 *
 * @param  url  an absolute URL giving the base location of the image
 * @param  name the location of the image, relative to the url argument
 * @return      the image at the specified URL
 * @see         Image
*/

/*
 Tarife:
	- normal
		bis 3,00 kg:        7,90 EUR
		ber 3,00 kg:        11,50 EUR

	- prime time
		bis 3,00 kg        14,20 EUR
		ber 3,00 kg        17,50 EUR

Volumen (nicht vom Tarif abhngig):			

	0-10 m3		+ 1 EUR pro m3		
	ber 10 m3 	+ 2 EUR pro m3
 */

public class Delivery {
	float gewicht = 0;
	float volumen = 0;
	float totalCosts = 0;
	String tarif = "normal";
	
	
	public Delivery(String tarif, float gewicht, float volumen) {
		setTarif(tarif);
		setGewicht(gewicht);
		setVolumen(volumen);
	}


	public float getTotalCosts() {
		if (this.getTarif().equalsIgnoreCase("normal")) {
			if (this.getGewicht() < 3) {
				totalCosts = 7.9f;
			} else {
				totalCosts = 11.5f;
			}
		} else {
			if (this.getGewicht() < 3) {
				totalCosts = 14.2f;
			} else {
				totalCosts = 17.5f;
			}
		}
		
		if (this.getVolumen() < 10) {
			totalCosts = totalCosts + 1 * this.getVolumen();
		} else {
			totalCosts = totalCosts + 2 * this.getVolumen();
		}
		return totalCosts;
	}
	
	public float getGewicht() {
		return gewicht;
	}


	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}


	public float getVolumen() {
		return volumen;
	}


	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}


	public String getTarif() {
		return tarif;
	}


	public void setTarif(String tarif) {
		this.tarif = tarif;
	}
	
	
}
