fun main(){
    var num: Int?
    var i = 1

    print("digite um numero: ")
    num = readLine()!!.toIntOrNull()

    if (num == null || num <= 0 ){
        print("digite um numero válido!")
    }else{
        while (i < num+1){
            print("$i, ")
            i++
        }
    }
}