package design.patterns.factory.simple;

import design.patterns.factory.Computor;
import design.patterns.factory.DellComputor;
import design.patterns.factory.LenovoComputor;

/**
 * 简单工厂:适合产品数量不多
 */
public class SimpleFactory {
    public Computor getInstance(String name){
        if("戴尔".equals(name)){
            return new DellComputor();
        }else if("联想".equals(name)) {
            return new LenovoComputor();
        }
        return null;
    }

    /**
     * 客户端
     * @param args
     */
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Computor lenovo = simpleFactory.getInstance("联想");
        lenovo.open();
    }
}
