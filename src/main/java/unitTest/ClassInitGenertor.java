package unitTest;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import unitTest.model.User;

/**
 * @author liuyu.lu
 * @since Jun 24, 2016
 */
public class ClassInitGenertor {

	private static int intCount = 0;
	private static int stringCount = 0;
	private static double doubleCount = 0.2;
	private static final String newFormat = "%s %s = new %s();";
	private static final String setFormat = "%s.set%s(%s);";

	public static void main(String[] args) {
		printInitCode(User.class);
	}

	private static void printInitCode(Class<?> clazz) {
		Field[] fields = clazz.getDeclaredFields();
		// new
		String clazzName = clazz.getSimpleName();
		String lClazzName = StringUtils.uncapitalize(clazzName);
		System.out.println(String.format(newFormat, clazzName, lClazzName, clazzName));

		// set
		Object value = null;
		for (Field field : fields) {
			Class<?> type = field.getType();
			if (type.equals(int.class) || type.equals(Integer.class)) {
				value = ++intCount;
			} else if (type.equals(Short.class) || type.equals(short.class)) {
				value = "(short)" + ++intCount;
			} else if (type.equals(long.class) || type.equals(Long.class)) {
				value = ++intCount + "l";
			} else if (type.equals(String.class)) {
				value = "\"hello" + ++stringCount + "\"";
			} else if (type.equals(Boolean.class) || type.equals(boolean.class)) {
				value = "true";
			} else if (type.equals(Double.class) || type.equals(double.class)) {
				value = ++doubleCount;
			} else if (type.equals(BigDecimal.class)) {
				value = "new BigDecimal(" + ++doubleCount + ")";
			} else if (type.equals(Date.class)) {
				value = "new Date()";
			} else if (isCustomerObject(type)) {
				System.out.println();
				printInitCode(type); 
				value = StringUtils.uncapitalize(type.getSimpleName());
				System.out.println();
			} else {
				value = "";
			}
			System.out.println(String.format(setFormat, lClazzName, StringUtils.capitalize(field.getName()), value.toString()));
		}
	}

	private static boolean isCustomerObject(Class<?> type) {
		return !type.getName().startsWith("java");
	}
}
