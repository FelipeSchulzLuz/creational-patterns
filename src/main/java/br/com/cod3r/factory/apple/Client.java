package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.enums.IPhoneType;

public class Client {

	public static void main(String[] args) {
		IPhoneType iphoneX = IPhoneType.IPHONE_X;
		IPhoneType iphone11Pro = IPhoneType.IPHONE_11_PRO;

		System.out.println("### Ordering an iPhone X");
		iphoneX.orderPhone();

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		iphone11Pro.orderPhone();
	}
}
