class PrefixTree {

    class TrieNode {
        TrieNode[] links = new TrieNode[26];
        boolean flag = false;
    }

    private TrieNode root;

    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode node = root;
        for(char c: word.toCharArray()) {
            int index = c - 'a';

            if(node.links[index] == null) {
                node.links[index] = new TrieNode();
            }

            node = node.links[index];
        }
        node.flag = true;

    }

    public boolean search(String word) {

        TrieNode node = root;
        
        for(char c: word.toCharArray()) {
            int index = c - 'a';
            if(node.links[index] == null) {
                return false;
            }
            node = node.links[index];
        }

        return node.flag;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        
        for(char c: prefix.toCharArray()) {
            int index = c - 'a';
            if(node.links[index] == null) {
                return false;
            }
            node = node.links[index];
        }

        return true;
    }
}
