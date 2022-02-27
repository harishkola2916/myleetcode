class LRUCache {
    Node start, end;
    HashMap<Integer,Node> cache;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
    }
    
    public int get(int key) {
          if(cache.containsKey(key)){
            Node node = cache.get(key);
            removeNode(node);
            addToTop(node);
                return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.value = value;
            removeNode(node);
            addToTop(node);
        } 
        else {
            Node newNode = new Node(key, value);
          if(cache.size() == capacity){
              cache.remove(end.key);
              removeNode(end);
              addToTop(newNode);
              
          }
          else {
              addToTop(newNode);
          }
          cache.put(key,newNode);
        }
        
    }
    
    void removeNode(Node node){
        if(node.left != null){
            node.left.right = node.right;
        } else {
            start = node.right;
            
        }
        
        if(node.right != null){
            node.right.left = node.left;
        } else {
            end = node.left;
        }
        
    }
    
    void addToTop(Node node){
        node.right = start;
        node.left = null;
        if(start!=null){
            start.left = node;
        }
        start = node;
        if(end == null){
            end = start;
        }
    }
    
}

public class Node {
        int key;
        Node left;
        Node right;
        int value;
        
        public Node(int key, int value){
            this.key = key;
            this.left = null;
            this.right = null;
            this.value = value;
            
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */