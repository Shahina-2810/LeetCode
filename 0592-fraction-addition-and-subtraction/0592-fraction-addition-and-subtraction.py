class Solution:
    def fractionAddition(self, expression: str) -> str:
        fractions = re.findall('[+-]?\d+/\d+', expression)
        fractions = [tuple(map(int, fraction.split('/'))) for fraction in fractions]
        lcm = 1
        for fraction in fractions:
            lcm = lcm * fraction[1] // math.gcd(lcm, fraction[1])
        
        numerator_sum = sum([fraction[0] * (lcm // fraction[1]) for fraction in fractions])
        
        gcd = math.gcd(numerator_sum, lcm)
        numerator = numerator_sum // gcd
        denominator = lcm // gcd
        
        return str(numerator) + '/' + str(denominator)