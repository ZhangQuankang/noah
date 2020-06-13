package BitSet;

import java.util.BitSet;

/**
 * 素数筛选
 * Eratosthenes筛子算法
 * 算法本质：如果一个数是素数的倍数，那么他肯定不是素数
 * create by zhangquankang on 2020/6/9
 */
public class Sieve {
    public static void main(String[] args) {
        int n = 100;
        //记录时间
        long start = System.currentTimeMillis();
        //用BitSet来存储，初始化个数
        BitSet b = new BitSet(n + 1);
        //记录存储的个数
        int count = 0;

        int i;
        //初始化连续数组，从2开始到目标的连续数组，放进BitSet中
        for (i = 2 ; i <= n ;i++){
            b.set(i);
        }

        //指定第一个因子为第一个素数2
        i = 2;
        /**
         * 循环次数的结束条件为 n的平方，我们可以认为，在超过n后的数，
         * 都会是以2-n为因子的合数，或者是质数，如果是质数的话需要保留，
         * 如果是合数的话，则已经在2-n的循环中剔除过了，所以无需剔除
         */
        while (i * i <= n){
            if(b.get(i)){
                count++;
                //让其中一个因子自增，逐个剔除掉 2n，3n，4n。。。以此类推
                int k = 2 * i;
                while(k <= n){
                    b.clear(k);
                    k += i;
                }
            }
            i++;
        }

        //循环BitSet，统计个数
        while (i <= n){
            if(b.get(i)){
                count++;
            }
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count + "primes");
        System.out.println((end - start) + "milliseconds");
    }
}
