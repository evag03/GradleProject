Consulted with:

Bibliography:



Journal:

PHASE 0
DAY 1 - 11/30/23
Eva & Musa
7:00 PM - 8:00 PM
Progress:
 - Picked dataset
 - Filled in required information in data_description text file
 - Copy/pasted dataset into new text file
 - Attempted to run Main file, recieved error
Questions:
 - What does 'WCC' stand for? (i.e. "Nodes in largest WCC:")
Weakly Connected Components algorithm finds sets of connected nodes in directed and undirected graphs. Two nodes are connected, if there exists a path between them. The set of all nodes that are connected with each other form a component.
Source: https://neo4j.com/docs/graph-data-science/current/algorithms/wcc/#:~:text=The%20Weakly%20Connected%20Components%20(WCC,each%20other%20form%20a%20component.

 - What does 'SCC' stand for? (i.e. "Nodes in largest SCC:")
Strongly Connected Components algorithm is when there is a path in each direction between each pair of vertices of the graph.
Source: https://en.wikipedia.org/wiki/Strongly_connected_component#:~:text=A%20directed%20graph%20is%20called,second%20vertex%20to%20the%20first.

 - Should we delete the _MACOSX file in the GraphDisplay file? Does it only exist as a MacOS alternative for the graph display?
Yes, but no longer relevant due to separate Gradle file

 - Why is Main returning an error when attempting to run? Error: "Unsupported operation. Please use pom.xml file to manage the source directories of maven project."
Probably because we did not have Gradle installed; no longer relvant due to separate Gradle file

 - How do we figure out how to interpret the values in our dataset when the website doesn't clarify what values exactly mean what?
Can use context clues for existence of nodes (i. e. a path between a Node A and Node B implies existence of a Node A and B). Making a graph is still possible due to the two columns of numbers repsenting the path between nodes (i.e the first number in line 5 is showing Node 0, which has a path to Node 1), we just won't know where in Texas these roads are. Maybe look at the paper for more context?

PHASE 1
DAY 2 - 12/4/23
Eva & Musa
7:00 PM - 9:00 PM
Progress:
 - Ran into issues with Gradle being unable to run & taking abnormally long to build
 - Programmed file reader that looks at each line and prints out the node it starts with and what node that first node travels to
Questions:
 - Are we going to have to guide Gradle through our files every time we want it to analyze the text file like how we had to do for it to properly use the file reader?

Reflection:

