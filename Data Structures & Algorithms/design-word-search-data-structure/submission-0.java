class WordDictionary {

    class TrieNode {
        TrieNode[] links = new TrieNode[26];
        boolean flag = false;
    }

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;

        for(char c: word.toCharArray()){
            int index = c - 'a';
            if(node.links[index]==null) {
                node.links[index] = new TrieNode();
            }
            node = node.links[index];
        }
        node.flag = true;
    }

    public boolean search(String word) {
        return dfs(word,0,root);
    }

    private boolean dfs(String word, int index, TrieNode node) {

        if(index == word.length()){
            return node.flag;
        }

        char c = word.charAt(index);

        if(c=='.') {
            for(TrieNode child : node.links){
                if(child!=null && dfs(word,index+1,child)) {
                    return true;
                }
            }
        } else {
            int i = c - 'a';
            if(node.links[i] == null) {
                return false;
            }
            return dfs(word,index+1,node.links[i]);
        }
        return false;
    }
}
