# Proxy-Pattern-Java
COMP 373/473 - Objects/Frameworks/Patterns - Spring 2016 - Project 3 Proxy Pattern

The purpose of a proxy is to act as an intermediate object between the client and the target object. In this example, a ProxyImage object is an intermediate object between the ProxyPattern client and the HighResolutionImage target object. Both the ProxyImage and HighResolutionImage implement the ImageInterface. By using a proxy image, the real high resolution is only created when the client asks for it. Before displaying the image, the proxy checks if the image was already created, and if it was, then it can bypass the loading process and go right to displaying the image. Proxy is a useful pattern for this case because it is expensive to load a high resolution image each time the display method is called.




[Proxy Pattern Resource](https://en.wikipedia.org/wiki/Proxy_pattern#Java)
