package br.com.cod3r.factory.apple.enums;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXSMaxFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public enum IPhoneType {
    IPHONE_11 {
        public IPhone orderPhone() {
            IPhone11Factory iphone11Factory = new IPhone11Factory();
            return iphone11Factory.orderIPhone();
        }
    },
    IPHONE_11_PRO {
        public IPhone orderPhone() {
            IPhone11ProFactory iphone11ProFactory = new IPhone11ProFactory();
            return iphone11ProFactory.orderIPhone();
        }
    },
    IPHONE_X {
            public IPhone orderPhone() {
                IPhoneXFactory iphoneXFactory = new IPhoneXFactory();
                return iphoneXFactory.orderIPhone();
            }
    },
    IPHONE_XS_MAX {
        public IPhone orderPhone() {
            IPhoneXSMaxFactory iphoneXSMaxFactory = new IPhoneXSMaxFactory();
            return iphoneXSMaxFactory.orderIPhone();
        }
    };

    public abstract IPhone orderPhone();

}