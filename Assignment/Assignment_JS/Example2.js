function sortDecending(num)
{
    return num.sort((a,b)=> b-a)
}

const numbers = [5,2,9,1,7,6];
console.log(sortDecending(numbers));