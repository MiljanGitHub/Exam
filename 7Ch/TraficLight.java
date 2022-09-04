public sealed interface TraficLight{}

final class RedLight implements TraficLight{}

sealed class YellowLight implements TraficLight{} //with first three lines it DOES NOT COMPILE; 
												//YellowLight must have a class which extends it (that is a 'permits' list, inserted by a compiler, must not be empty. And since we are in a single file we just need to define a inheriting class):

//Sealed class or interface lacks the permits clause and no class or interface from the same compilation unit declares YellowLight as its direct superclass or superinterface
final class SpecialYellowLight extends YellowLight{} //