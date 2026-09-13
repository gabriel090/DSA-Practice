public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets; /// capacity
    private int size; /// number of key value pair in hash table or number of hash nodes



    public HashTable(int capacity){
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }


    private  class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        private HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }
}
