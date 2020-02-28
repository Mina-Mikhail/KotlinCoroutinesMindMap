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
5. Job.
6. Scopes.
7. Builders.
8. Dispatchers.
9. Suspended Functions.
10. Channels.
11. Flow.



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


## 4. Coroutine Context
Each Coroutine created has a Context. A Coroutine Context is a map! Similar to data structure maps, but build specific for Coroutines. It has **keys** represented as `Elements` and **values** which are the value that coroutine has. And **functions** to operate on it.

![Coroutine Context](../master/files/coroutineContext.png "Coroutine Context")


## 5. Job
A Job is **life-cycle** with state of: New, Active, Completing, Cancelling, Cancelled, Completed. And a hierarchy of **Parent and Child**. It can be canceled effecting his children/parent, unless it is a SupervisorJob. It cannot returned a result value, unless it is a Deferred.


![Coroutine Job](../master/files/coroutineJob.png "Coroutine Job")


## 6. Scopes
A way to limit where coroutines created. It can track coroutines and cancel them *(Similarity shown here to `CoroutineContext` and `Job`! That's because `Scope` encapsulates/uses them)*.

![Coroutine Scopes](../master/files/Scope.png "Coroutine Scopes")


## 7. Builders
Builders are functions that create the coroutines. Some builder need scopes some not. some can return a result encapsulated in Deferred object, some only return a Job with not result.

![Coroutine Builders](../master/files/Builders.png "Coroutine Builders")


## 8. Dispatchers
A way to determine where we want to place our coroutine.

![Coroutine Dispatchers](../master/files/Dispatchers.png "Coroutine Dispatchers")






#### References



#### About Me
Mohammad Laif
Twitter:
> https://twitter.com/mohammadlaif