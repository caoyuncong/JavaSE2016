package generic;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/23 0023.
 */
/*public interface GenericInterfaceTest<T extends Number,S extends Serializable> {

    void m1(T t,S s);

    T m2(S s);
}

class GenericInterfaceImpl<T extends Number,S extends Serializable> implements
        GenericInterfaceTest<T,S>{

    @Override
    public void m1(T t, S s) {

    }

    @Override
    public T m2(S s) {
        return null;
    }
}*/
public interface GenericInterfaceTest<T,S> {

    void m1(T t,S s);

    T m2(S s);
}
class GenericInterfaceImpl<T, S> implements GenericInterfaceTest<T, S> {

    @Override
    public void m1(T t, S s) {

    }

    @Override
    public T m2(S s) {
        return null;
    }
}