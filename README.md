# Kotlin Coroutines Mindmap
A Mindmap abstracting Kotlin Coroutines.

## Overview
This repository contains files that explains Coroutines Library in Kotlin as a mind-mapping using MindNode App for Mac. Coroutines implemented in Kotlin language as a first-party library for writing asynchronous code (non-blocking), also it provides other ways to achieve  concurrency.

## Version
Kotlin Coroutines: **1.3**

## Preview
This preview is automatically generated for the mindmap source file.

![Kotlin Coroutines](../master/files/mindmapsourcefile.mindnode/QuickLook/Preview.jpg "Kotlin Coroutines")

## Subjects
1. Origin of Coroutine.
2. Where Coroutines Lives.
3. Coroutine Creation.
4. Coroutine Context.
5. Scopes.
6. Builders.
7. Dispatchers.
8. Suspended Functions.
9. Channels.
10. Flow.



## 1. Origin of Coroutine
A Coroutine is another part from Routines, while the other part was subroutine. First appears in 1963 in paper titled "Design of a Separable Transition-Diagram Compiler" by Melvin Conway, and content an explanation for it as follows:

> The coroutine approach to the same problem accomplishes the switching job implicitly by use of the subroutine calling sequence. When Coroutines A and B are connected so that A sends items to B, B runs for a while until it encounters a read command, which means it needs something from A. Then control is transferred to A until it wants to "write," whereupon control is returned to B at the point where it left off.

![Origin of Coroutine](../master/files/originofcoroutine.png "Origin of Coroutine")


## 2. Where Coroutines Lives
Whenever we create a coroutine it lives inside a threads.

![Coroutines Lives](../master/files/coroutinelives.png "Coroutines Lives")


## 3. Coroutine Creation
First step to create a coroutine is by specifies the scope that it binds to it. Second we use a builder function to build it. Third we need a dispatcher to take it and placed it in a Thread.

![Coroutine Creation](../master/files/coroutinescreation.png "Coroutine Creation")



#### References


#### About Me
Mohammad Laif
Twitter:
> https://twitter.com/mohammadlaif