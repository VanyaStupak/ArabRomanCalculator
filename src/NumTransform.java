import java.util.HashMap;
import java.util.Map;

public class NumTransform{

        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
//Перевод с арабских чисел в римские от 0 до 100
        public Map<Integer, String> arabToRome(){
                Map<Integer, String> arabRome = new HashMap<>();
                for (int i = 0; i < roman.length; i++){
                        arabRome.put(i, roman[i]);
                }
                return arabRome;
        }
//Перевод с римсих чисел в арабские от 0 до 10
        public Map<String, Integer> romeToArab() {
                Map<String, Integer> romeArab = new HashMap<String, Integer>();
                romeArab.put("I", 1);
                romeArab.put("II", 2);
                romeArab.put("III", 3);
                romeArab.put("IV", 4);
                romeArab.put("V", 5);
                romeArab.put("VI", 6);
                romeArab.put("VII", 7);
                romeArab.put("VIII", 8);
                romeArab.put("IX", 9);
                romeArab.put("X", 10);
                return romeArab;
        }

}
