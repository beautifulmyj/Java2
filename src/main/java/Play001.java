//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//
//public class Play001 {
//    public static void main(String[] args) {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
////        Girl girl = new Girl("myj", 18);
////        String s = mapper.writeValueAsString(girl);
//
//        String myj ="{ \"name\" : \"jiaojiao\", \"age\" : 19, \"city\" : \"beijing\" }";
//
//        Girl girl1 = null;
//        try {
//            girl1 = mapper.readValue(myj, Girl.class);
//        } catch (JsonProcessingException e) {
//            System.out.println("Wrong json string");
//        }
//
//
//        System.out.println(girl1);
//
////        System.out.println(s);
//    }
//
//    @Test
//    public void run() {
//
//    }
//}
//
//class Girl {
//    String name;
//    int age;
//
//    public Girl() {
//    }
//
//    public Girl(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Girl{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}