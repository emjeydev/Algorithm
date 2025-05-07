import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MagicReflection {
    public Class[] getClasses() {
        return JavaDonLibrary.class.getDeclaredClasses();
    }

    public Method[] getMethods(String className) throws ClassNotFoundException {
        Class<?> c = Class.forName("JavaDonLibrary" + "$" + className);
        return c.getDeclaredMethods();
    }

    public String callRevealHiddenSpell() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<SecretsOfFlying> secretsOfFlying = SecretsOfFlying.class;
        Method method = secretsOfFlying.getDeclaredMethod("revealHiddenSpell");
        method.setAccessible(true);
        SecretsOfFlying secretsOfFlyingObj = new SecretsOfFlying();
        return (String) method.invoke(secretsOfFlyingObj);
    }

    public String callCastSpell(String spellName) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        Field declaredField = SecretsOfFlying.class.getDeclaredField("spellName");
        declaredField.setAccessible(true);
        SecretsOfFlying secretsOfFlyingObj = new SecretsOfFlying();
        declaredField.set(secretsOfFlyingObj, spellName);
        return (String) SecretsOfFlying.class.getDeclaredMethod("castSpell").invoke(secretsOfFlyingObj);
    }
}
