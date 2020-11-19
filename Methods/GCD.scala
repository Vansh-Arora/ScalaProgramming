def reverse(in: String): String = {
    if(in.length == 1) in
    else reverse(in.tail) + in.head
    }


def bin_to_dec(bin: String): Int = {
    Integer.parseInt(bin,2)
}

def dec_to_bin(dec: Int): String = {
    Integer.toBinaryString(dec)
}

val isPrime = (x: Int) => {
    var st = 0
    for(i<-2 to x/2)
    {
        if(x%i == 0){
            st = 1
        }
    }
    if(st == 1 && x != 1) 0
    else if(st == 0 && x != 1) 1
}