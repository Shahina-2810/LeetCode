char* simplifyPath(char* path) {
     int len = strlen(path);
    // Allocate memory for stack
    char *stk = (char*) malloc ((len+1)*sizeof(sizeof(char))); 
    int top = 0;
    stk[0] = path[0]; // Initialiaze stack with first path character ('/')

    for(int i=1; i < len; i++){
        // Case "//" or "/<EndOfString(\0)>"
        if(path[i]=='/' && (stk[top]=='/' || path[i+1]=='\0' || top==0))
            continue;
        // Case "/../"  or "/..<EndOfString(\0)>""   
        if(path[i-1] == '/' && path[i] == '.'  && path[i+1] == '.' && (path[i+2] == '/' || path[i+2] == '\0')){
            if(i != 1 && top != 0)
                top--; // Remove last '/' of "/../"
            while(top >= 0 && stk[top] != '/')
                top--;
            i+=2;
        }
        // Case /. or /./
        else if(path[i-1] == '/' && path[i] == '.'  && (path[i+1] == '/' || path[i+1] == '\0')){
            if(i != 1 && top != 0) 
                top--;
        }
        else 
            stk[++top] = path[i];
        
        stk[top+1] = '\0';
    }
    // If there is a '/' remaining in the end removes it
    if(top >0 && stk[top]=='/')
        top--;
    
    stk[top+1] = '\0'; // Define EndOfString(\0) in top+1 
    return stk; 
}