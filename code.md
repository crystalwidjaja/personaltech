# Individual Tech Requirements:

Final Grade Calculator
- Passes in three variables: current, desired, and percent
- Current refers to the current grade, desired refers to the desired grade, and percent refers to the percentage that a final is worth
- From there, we create weight which turns the percent into a decimal value that we can then use to calculate the requiredGrade
- The variables are obtained through simple input boxes on the front end. These are designed to only take inputs.
- There is a section of code that rounds the percentage needed to the nearest hundreth.

Required Grade Calculation Logic: takes the weight and inverses it and multiplies it by current - This creates the points that an individual has already earned in the class. From there, we divide this value by the weight to essentially inflate the value to include the total points an individual has. Finally we remove the desired outcome from these inflated points to get the percentage needed on a final exam.

Back End:
```
   @GetMapping("/services/gradecalc")
    public String TableCTRL(@RequestParam(name = "current", required = false, defaultValue = "0") double current,
                            @RequestParam(name = "desired", required = false, defaultValue = "0") double desired,
                            @RequestParam(name = "percent", required = false, defaultValue = "0") double percent,
                            Model model) {
        double weight = percent / 100;
        double requiredGrade = (desired - ((1 - weight) * current)) / weight;
        model.addAttribute("output", Math.round(requiredGrade * 100.0) / 100.0);
        return "/services/gradecalc";
    }
```

[Front End](https://github.com/avabrooks/swagketo/blob/master/src/main/resources/templates/services/resume.html):

Requirements Page
 - The requirements page was originaly seen as an easy feat, but was then proven to be extremely difficult.
 - Surprisngly, the backend was the easiest part. I created doubles for each of the required fields.
 - The variables are easily manipulated using input boxes that are the same as the grade calculator. 

The Percentage Box Journey: I found a stylized loading box which I used as a template for each of the bars for the subjects. At the time, the percentages were hard coded in, so I had to find a way to adjust this. I realized that the green bar was controlled using the width feature, so I looked for different ways and syntaxes to adjust the width. Finally, I landed on a somewhat easy solution using the th:style command. From there, I scoured the internet for the syntax to properly manipulate the width which can be scene here:

```
            <p class="className mb-2">English</p>
            <div class="bar-div">
                <div th:style="'width:' + ${english} + '%'" class="skill php" th:text="${english} + '%'"></div>
            </div>
```

Back End:

```
@GetMapping("/requirements")
    public String requirements(
            @RequestParam(name = "english", required = false, defaultValue = "0") double english,
            @RequestParam(name = "math", required = false, defaultValue = "0") double math,
            @RequestParam(name = "pe", required = false, defaultValue = "0") double pe,
            @RequestParam(name = "civics", required = false, defaultValue = "0") double civics,
            @RequestParam(name = "econ", required = false, defaultValue = "0") double econ,
            @RequestParam(name = "elective", required = false, defaultValue = "0") double elective,
            @RequestParam(name = "fafl", required = false, defaultValue = "0") double fafl,
            @RequestParam(name = "art", required = false, defaultValue = "0") double art,
            @RequestParam(name = "health", required = false, defaultValue = "0") double health,
            @RequestParam(name = "lifescience", required = false, defaultValue = "0") double lifescience,
            @RequestParam(name = "physicalscience", required = false, defaultValue = "0") double physicalscience,
            @RequestParam(name = "ushistory", required = false, defaultValue = "0") double ushistory,
            @RequestParam(name = "whistory", required = false, defaultValue = "0") double whistory,
            Model model) {
        model.addAttribute("english", english / 40 * 100);
        model.addAttribute("math", math / 20 * 100);
        model.addAttribute("pe", pe / 20 * 100);
        model.addAttribute("civics", civics / 5 * 100);
        model.addAttribute("econ", econ / 5 * 100);
        model.addAttribute("elective", elective / 85 * 100);
        model.addAttribute("fafl", fafl / 5 * 100);
        model.addAttribute("art", art / 5 * 100);
        model.addAttribute("health", health / 5 * 100);
        model.addAttribute("lifescience", lifescience / 10 * 100);
        model.addAttribute("physicalscience", physicalscience / 10 * 100);
        model.addAttribute("ushistory", ushistory / 10 * 100);
        model.addAttribute("whistory", whistory / 10 * 100);
        return "/services/requirements";
    }
```
[Front End](https://github.com/avabrooks/swagketo/blob/master/src/main/resources/templates/services/requirements.html)

