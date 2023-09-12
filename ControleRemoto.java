package aula1;
public class ControleRemoto implements Controlador {

	//Atributos
private int volume;
private boolean ligado;
private boolean tocando;
private boolean mudar;
//métodos especiais

public ControleRemoto() {
this.volume = 50;
this.ligado = false;
this.tocando = false;
this.mudar = true;

}

public int getVolume() {
	return volume;
}

public void setVolume(int volume) {
	this.volume = volume;
}

public boolean getLigado() {
	return ligado;
}

public void setLigado(boolean ligado) {
	this.ligado = ligado;
}

public boolean getTocando() {
	return tocando;
}

public void setTocando(boolean tocando) {
	this.tocando = tocando;
}

public boolean getMudar() {
	return mudar;
}

public void setMudar(boolean mudar) {
	this.mudar = mudar;
}
	
public boolean getavhdmi () {
		return avhdmi;
	}
public void setavhdmi (boolean avhdmi) {
	this.avhdmi = avhdmi;
}

//métodos abstratos // interface

@Override
public void ligar() {
this.setLigado(true);	
}

@Override
public void desligar() {
this.setLigado(false);	
}

@Override
public void abrirMenu() {
System.out.println ("======= MENU =======");
System.out.println ("----Está ligado?---" + this.getLigado());
System.out.println ("----Está tocando?----" + this.getTocando());
System.out.println ("----Mudar de canal----" + this.getMudar());
System.out.println ("----Mudar para AV----" + this.getMudar());
System.out.println ("----Mudar para HDMI----" + this.getMudar());
System.out.print("Volume:"+ this.getVolume());
for (int i = 0;i <= this.getVolume (); i+=10 ) {
System.out.print ("||");

}

}

@Override
public void fecharMenu() {
System.out.println ("Fechando Menu...");

}

@Override
public void maisVolume() {
if (this.getLigado()) {
	this.setVolume(this.getVolume ()+1);
}
}

@Override
public void menosVolume() {
if (this.getLigado()) {
	this.setVolume (this.getVolume ()-1);
}
}

@Override
public void LigarMudo() {
	if (this.getLigado() && this.getVolume()>0) {
		this.setVolume (0);
}
}

@Override
public void desligarMudo() {
if (this.getLigado() && this.getVolume()==0) {
	this.setVolume (50);
}
}

@Override
public void play() {
	if (this.getLigado () &&!(this.getTocando())) {
		this.setTocando(true);
	}
}

@Override
public void pause() {
if (this.getLigado () && (this.getTocando())) {
	this.setTocando (false);
}
}

@Override
public void MudardeCanal() {
	if (this.getLigado() && (this.getMudar())) {
this.setavhdmi(false);		
	System.out.println ("Mudando de canal...");
	}
}

@Override
public void MudarparaAv() {
if (this.getLigado () ) {
	System.out.println ("Mudando para AV");
	
}
}

@Override
public void MudarparaHdmi() {
if (this.getLigado ()) {
System.out.println ("Mudando para HDMI");	
}
}
}
