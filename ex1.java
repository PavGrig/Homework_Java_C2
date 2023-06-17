// 1) Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow

public class ex1 {

    public static void main(String[] args) {
        
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}"; 
        
        StringBuilder result = new StringBuilder("select * from students WHERE ");
        
        String str1 = str.replaceAll("[{}' ]", "");
        
        String [] strArray = str1.split(",");
        
        for (int i =0; i < strArray.length; i++) {
            String[] strArray1 = strArray[i].split(":");
            if(strArray1[1].equals("null") == false) {
                    
                    result.append(strArray1[0]);
                    result.append("=");
                    result.append(strArray1[1]);
                    result.append(" AND ");
            
            }
        }

        result.delete(result.length() - 4, result.length());
           
        System.out.println(result);
    }
}
