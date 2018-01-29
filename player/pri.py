def main():
 s = int(input(" "))
 r = int(input(""))

 for num in range(s+1,r ):
  
   if num > 1:
       for i in range(2,num):
           if (num % i) == 0:
               break
       else:
           print(num)

if __name__ == '__main__':
    main()
