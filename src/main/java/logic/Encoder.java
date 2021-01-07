package logic;

public class Encoder {

    /**
     * @param text  входной текст для шифрования
     * @param key ключ, которым будет шифроваться текст
     * @return зашифрованный текст
     */
    public String encryption(String text, String key){

        //по условию размер ключа не должен быть  меньше входного слова.
        //Для этого нужно проверить ключ и ри необходимости его изменить.
        //Вводится переменная, которая будет хранить ключ, который удовлетворяет условию
        StringBuilder newKey = new StringBuilder(key);

        while (newKey.length()<text.length()){
            newKey.append(key);
        }
        //////////////////////////////////////////


        // На выходе должен быть зашифрованный текст.
        // Для шифрования нужно пройтись по всему входному слову, преобразовать символы и вывести результат
        String outputText = "";
        for (int i = 0; i<text.length();i++){
            //код символа входного текста
            int P = text.charAt(i);
            //код символа ключа
            int K = newKey.charAt(i);
            //Побитовое исключающее ИЛИ
            int C = P^K;
            //Добавление символа в зашифрованный текст
            outputText+=C+" ";
        }

        return outputText;
    }

}
