import java.util.*;

public class findAllPossibleRecipe2115 {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        // Graph and indegree map
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> indegree = new HashMap<>();
        
        // Initialize the graph
        for (String recipe : recipes) {
            indegree.put(recipe, 0);
        }

        // Build the graph
        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            for (String ingredient : ingredients.get(i)) {
                // Add dependencies
                graph.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(recipe);
                indegree.put(recipe, indegree.getOrDefault(recipe, 0) + 1);
            }
        }

        // Add supplies to queue
        Queue<String> queue = new LinkedList<>(Arrays.asList(supplies));
        Set<String> created = new HashSet<>(Arrays.asList(supplies));

        List<String> result = new ArrayList<>();

        // Topological sorting
        while (!queue.isEmpty()) {
            String item = queue.poll();
            
            if (indegree.containsKey(item) && indegree.get(item) == 0) {
                result.add(item);
            }
            
            if (!graph.containsKey(item)) continue;

            for (String neighbor : graph.get(item)) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);

                if (indegree.get(neighbor) == 0 && created.containsAll(ingredients.get(Arrays.asList(recipes).indexOf(neighbor)))) {
                    queue.add(neighbor);
                    created.add(neighbor);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] recipes = {"bread", "sandwich", "burger"};
        List<List<String>> ingredients = Arrays.asList(
                Arrays.asList("yeast", "flour"),
                Arrays.asList("bread", "meat"),
                Arrays.asList("sandwich", "meat", "bread")
        );
        String[] supplies = {"yeast", "flour", "meat"};

        List<String> result = findAllRecipes(recipes, ingredients, supplies);
        System.out.println(result);
    }
}
