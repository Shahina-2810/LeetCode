class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                continue;
            }
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(component);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder result = new StringBuilder();
        for (String directory : stack) {
            result.append("/").append(directory);
        }

        return result.toString();
    }
}