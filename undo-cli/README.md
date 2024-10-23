# CLI
The major aim of the small application is to mimic command line tools. I wish to implement undo functionality using stack data structure.

### Major operations:
1. AddText() -> Adding a text to the document. (Document is a string)
2. RemoveText() -> Delete the text from the document.
3. Undo() -> To undo the latest command.

## Some concepts:
1. **Stack**: Stack is a data structure based on the LIFO-Last In First out principle. 
2. **String Builder**: String builder is a mutable sequence of characters. Unlike String, it is mutable in nature. Therefore, it is preferred in cases when mutability is required.   If you are doing a lot of string manipulations, like in loops, StringBuilder is much faster than String.