package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.UsRulesAbstractFactory;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory usRules = new UsRulesAbstractFactory();

		System.out.println("### Ordering an iPhone 11 in Brazil");
		IPhoneFactory iphone11BrazilFactory = new IPhone11Factory(brazilianRules);
		iphone11BrazilFactory.orderIPhone("standard");

		System.out.println("### Ordering an iPhone XS Max in USA");
		IPhoneFactory iphoneXUsFactory = new IPhoneXFactory(usRules);
		iphoneXUsFactory.orderIPhone("highEnd");

	}
}
