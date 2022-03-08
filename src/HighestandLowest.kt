class HighestandLowest {

    /*
    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
    ** Example
    highAndLow("1 2 3 4 5")  // return "5 1"
    highAndLow("1 2 -3 4 5") // return "5 -3"
    highAndLow("1 9 3 4 -5") // return "9 -5"


    * */
        companion object {
        @JvmStatic
        fun highAndLow(numbers: String): String {
            val array = numbers.split(" ").toTypedArray()
            var highlighter = array.get(0).toInt();
            var lowest =array.get(0).toInt();

            for(i in array.iterator()){
                if(Integer.parseInt(i).compareTo(lowest)== -1)
                    lowest = Integer.parseInt(i)

                else if(Integer.parseInt(i).compareTo( highlighter) == 1)
                    highlighter = Integer.parseInt(i)

            }
            return  "$highlighter $lowest"
        }
    }
}