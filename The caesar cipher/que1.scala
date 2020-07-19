
object que1 extends App{
val alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
val encrypt= (c:Char,key:Int, a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);
val decrypt= (c:Char,key:Int ,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size);
println(alphabet.indexOf('Y'));
println(alphabet.size)
val cipher=(algo:(Char,Int,String)=>Char, s:String, key:Int, a:String)=>s.map(algo(_,key,a));
val ct=cipher(encrypt,"stuvw",5, alphabet);
val cp=cipher(decrypt,"ef",2,alphabet);
println(ct);
println(cp);











}
