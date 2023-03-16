package br.com.cod3r.factory.apple.enum;

public enum IPhoneType implements IPhoneFactory {
    IPHONE_11 {
        @Override
        public IPhone orderIPhone11() {
            return new IPhone11();
        }
        },
    IPHONE_11_PRO {
        @Override
        public IPhone orderIPhone11Pro() {
            return new IPhone11Pro();
        }
        
    },
    IPHONE_X {
        @Override
        public IPhone orderIPhoneX() {
            return new IPhoneX();
        }
    },
    },
    IPHONE_XS_MAX {
        @Override
        public IPhone orderIPhoneXSMax() {
            return new IPhoneXSMax();
        }
    },
}