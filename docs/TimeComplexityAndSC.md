Time Complexity Calculation Notes
1. Single Loop
Case 1
for(int i=1;i<=n;i++)

i changes:

1,2,3,4,5....n

Total iterations = n

TC = O(N)
2. Increase by Constant
Case 2
for(int i=1;i<=n;i=i+2)

i changes:

1,3,5,7...

Iterations ≈ n/2

Ignore constant:

TC = O(N)
3. Multiply by 2
Case 3
for(int i=1;i<=n;i*=2)

i changes:

1,2,4,8,16,32...

Need x such that:

2^x = n

Taking log:

x = log₂(n)

Ignore base:

TC = O(log N)
4. Divide by 2
Case 4
for(int i=n;i>=1;i/=2)

i changes:

n,n/2,n/4,n/8...

Again:

TC = O(log N)
5. Multiply by 3
for(int i=1;i<=n;i*=3)

Values:

1,3,9,27...

Formula:

3^x = n
x = log₃(n)

Ignore base:

TC = O(log N)
Root N Trick
Case 6
for(int i=1;i*i<=n;i++)

Condition:

i² ≤ n

Taking root:

i ≤ √n

Iterations:

1 to √n
TC = O(√N)
Easy Rule

Whenever you see:

i² ≤ n

directly think:

√N
Nested Loops
Case 7
for(i=1;i<=n;i++)
{
   for(j=1;j<=n;j++)
   {
   }
}

Outer:

N

Inner:

N

Total:

N × N
TC = O(N²)
Case 8
for(i=1;i<=n;i++)
{
   for(j=1;j<=i;j++)
   {
   }
}

Iterations:

1+2+3+...+N

Formula:

N(N+1)/2
TC = O(N²)
N Log N
Case 9
for(i=1;i<=n;i++)
{
   for(j=1;j<=n;j*=2)
   {
   }
}

Outer:

N

Inner:

log N

Total:

N × log N
TC = O(N log N)
Important Trap
Case 10
for(i=1;i<=n;i*=2)
{
   for(j=1;j<=i;j++)
   {
   }
}

Many students write:

O(logN × N)

Wrong ❌

Iterations:

1 + 2 + 4 + 8 + ... + N

GP Sum:

= 2N - 1

Ignore constants:

TC = O(N)

Very Important Interview Question.

Quick Recognition Table
Pattern	Time Complexity
i++	O(N)
i+=2	O(N)
i+=100	O(N)
i*=2	O(log N)
i/=2	O(log N)
i*=3	O(log N)
i*i <= n	O(√N)
Nested N,N	O(N²)
N + N	O(N)
N × logN	O(N log N)
N × N	O(N²)
Fastest to Slowest
O(1)
<
O(log N)
<
O(√N)
<
O(N)
<
O(N log N)
<
O(N²)
<
O(N³)
<
O(2^N)
<
O(N!)

Remember:

Smaller Time Complexity = Faster Code
Larger Time Complexity = Slower Code  