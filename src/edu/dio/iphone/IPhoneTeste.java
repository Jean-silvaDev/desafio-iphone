package edu.dio.iphone;

import edu.dio.iphone.componentes.*;

public class IPhoneTeste {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		IPod ipod = iphone;
		Phone phone = iphone;
		Internet internet = iphone;
		
		ipod.tocar();
		ipod.pausar();
		ipod.selecionarMusica("Musica selecionado");
		
		phone.ligar("11111111111");
		phone.atender();
		phone.iniciarCorreioDeVoz();
		
		internet.exibirPagina("https://www.site.com");
		internet.adicionarNovaAba();
		internet.atualizarPagina();
	}
}
