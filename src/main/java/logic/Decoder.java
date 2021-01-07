package logic;

public class Decoder {

    /**
     * @param text  входной текст для шифрования
     * @param key ключ, которым будет шифроваться текст
     * @return зашифрованный текст
     */
    public String decryption(String text, String key){
        //по условию размер ключа не должен быть  меньше входного слова.
        //Для этого нужно проверить ключ и при необходимости его изменить.
        //Вводится переменная, которая будет хранить ключ, который удовлетворяет условию
        StringBuilder newKey = new StringBuilder(key);

        while (newKey.length()<text.length()){
            newKey.append(key);
        }
        //////////////////////////////////////////

        //Для разделения числовых символов использовался пробел (для визуализации).
        //для валидного дешифрования eго нужно убрать
        String[] encodeText = text.split(" ");

        // На выходе должен быть расшифрованный текст.
        // Для дешифрования нужно пройтись по всему входному зашифрованному тексту, преобразовать символы и вывести результат
        String outputText = "";


        for (int i = 0; i<encodeText.length;i++){
            //код символа зашифрованного входного текста
            int C = Integer.parseInt(encodeText[i]);
            //код символа ключа
            int K = newKey.charAt(i);
            //Побитовое исключающее ИЛИ
            int P = C^K;
            //Добавление символа в зашифрованный текст
            outputText+=(char)P;
        }

        return outputText;

    }

}
