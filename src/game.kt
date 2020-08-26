class TypeIntro() {
    var expriancePoints: Int = 5
    val playerName: String = "Estragn"
    var hasSteed :Boolean=false;

    fun adding() {
        expriancePoints = expriancePoints + 5
        println(" { $expriancePoints + $playerName}")
        if (hasSteed==false){
            hasSteed=true;
        }
     var reflaction =playerName.reversed();
        print(reflaction)
    }
}
    fun main(){
val a= TypeIntro();
        a.adding();}



