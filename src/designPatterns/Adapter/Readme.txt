#Adapter Pattern#
(Structural Design Pattern)
1. Allows two non compatible interface to collaborate. Acts as a wrapper between two different objects.
Catches call from one object and transforms them to be recognizable by other objects.
2. It can help you elegantly solve the problem of incompatibility between objects with different interfaces.
3. Don't confuse with Decorator or Facade Design Pattern
The difference between an adapter and a facade is that a facade introduces a new interface and wraps the whole subsystem.
And a decorator, unlike an adapter, changes the object itself rather than the interface.



Example
1. MediaPlayerInterface (+play: void) -> implemented by AudioPlayer - default mp3 capability only.
2. AdvancedMediaPlayerInterface (+playMp4: void, +playWav: void)  -> implemented by Mp4Player & WavPlayer

Problem - If we want our AudioPlayer to play all formats (mp3, mp4 & wav), we need MediaAdapter class that implements MediaPlayerInterface and uses AdvancedMediaPlayerInterface Objects to play mp4 and wav formats.

This MediaAdapter to be used by AudioPlayer to play other formats (mp4 and wav).